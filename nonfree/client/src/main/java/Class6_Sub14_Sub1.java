import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class6_Sub14_Sub1 extends Class6_Sub14 {

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "I")
	private int anInt1929;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "D")
	private double aDouble35;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "Lclient!es;")
	private Class6_Sub8_Sub2 aClass6_Sub8_Sub2_1;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "Lclient!fc;")
	private Class101 aClass101_2;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!di", name = "I", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class6_Sub14_Sub1(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I")
	public int method1702() {
		return this.aClass6_Sub8_Sub2_1 == null ? 0 : this.aClass6_Sub8_Sub2_1.method2088();
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Lclient!es;")
	public Class6_Sub8_Sub2 method1703() {
		return this.aClass6_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method9061(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10676 < 3) {
			@Pc(26) int local26 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local26 < 0) {
				throw new IllegalStateException(String.valueOf(local26));
			}
			if (super.anInt10676 == 2) {
				if (this.aVorbisInfo1.channels <= 2 && this.aVorbisInfo1.channels >= 1) {
					this.aDSPState1 = new DSPState(this.aVorbisInfo1);
					this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
					this.aClass101_2 = new Class101(this.aVorbisInfo1.rate, Static328.anInt8868);
					this.aClass6_Sub8_Sub2_1 = new Class6_Sub8_Sub2(this.aVorbisInfo1.channels);
					return;
				}
				throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(110) float[][] local110 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble35 = this.aDSPState1.granuleTime();
		if (this.aDouble35 == -1.0D) {
			this.aDouble35 = (double) ((float) this.anInt1929 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local110[0].length);
		this.anInt1929 += local110[0].length;
		@Pc(158) Class6_Sub4_Sub2 local158 = this.aClass6_Sub8_Sub2_1.method2084(this.aDouble35, local110[0].length);
		Static397.method5728(local110, local158.aShortArrayArray3);
		for (@Pc(166) int local166 = 0; local166 < this.aVorbisInfo1.channels; local166++) {
			local158.aShortArrayArray3[local166] = this.aClass101_2.method2142(local158.aShortArrayArray3[local166]);
		}
		this.aClass6_Sub8_Sub2_1.method2085(local158);
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)D")
	public double method1704() {
		@Pc(12) double local12 = this.aDouble35;
		if (this.aClass6_Sub8_Sub2_1 != null) {
			local12 = this.aClass6_Sub8_Sub2_1.method2079();
			if (local12 < 0.0D) {
				local12 = this.aDouble35;
			}
		}
		return local12 - (double) (256.0F / (float) Static328.anInt8868);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	@Override
	public void method9058() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass6_Sub8_Sub2_1 != null) {
			this.aClass6_Sub8_Sub2_1.method2083();
		}
	}
}
