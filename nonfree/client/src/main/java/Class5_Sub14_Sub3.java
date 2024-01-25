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

@OriginalClass("client!rl")
public final class Class5_Sub14_Sub3 extends Class5_Sub14 {

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "Lclient!ki;")
	private Class5_Sub4_Sub5 aClass5_Sub4_Sub5_1;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	private int anInt8342;

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "Lclient!tl;")
	private Class355 aClass355_2;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "D")
	private double aDouble28;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub14_Sub3(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lclient!ki;")
	public Class5_Sub4_Sub5 method7157() {
		return this.aClass5_Sub4_Sub5_1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8230(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9655 < 3) {
			@Pc(18) int local18 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local18 < 0) {
				throw new IllegalStateException(String.valueOf(local18));
			}
			if (super.anInt9655 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass355_2 = new Class355(this.aVorbisInfo1.rate, Static417.anInt7038);
				this.aClass5_Sub4_Sub5_1 = new Class5_Sub4_Sub5(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(108) float[][] local108 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble28 = this.aDSPState1.granuleTime();
		if (this.aDouble28 == -1.0D) {
			this.aDouble28 = (double) ((float) this.anInt8342 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local108[0].length);
		this.anInt8342 += local108[0].length;
		@Pc(158) Class5_Sub1_Sub12 local158 = this.aClass5_Sub4_Sub5_1.method4722(local108[0].length, this.aDouble28);
		Static579.method7771(local108, local158.aShortArrayArray17);
		for (@Pc(166) int local166 = 0; local166 < this.aVorbisInfo1.channels; local166++) {
			local158.aShortArrayArray17[local166] = this.aClass355_2.method8036(local158.aShortArrayArray17[local166]);
		}
		this.aClass5_Sub4_Sub5_1.method4717(local158);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	@Override
	public void method8231() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.a();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.a();
		}
		this.aVorbisComment1.a();
		this.aVorbisInfo1.a();
		if (this.aClass5_Sub4_Sub5_1 != null) {
			this.aClass5_Sub4_Sub5_1.method4720();
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)D")
	public double method7158() {
		@Pc(12) double local12 = this.aDouble28;
		if (this.aClass5_Sub4_Sub5_1 != null) {
			local12 = this.aClass5_Sub4_Sub5_1.method4726();
			if (local12 < 0.0D) {
				local12 = this.aDouble28;
			}
		}
		return (double) -(256.0F / (float) Static417.anInt7038) + local12;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I")
	public int method7159() {
		return this.aClass5_Sub4_Sub5_1 == null ? 0 : this.aClass5_Sub4_Sub5_1.method4715();
	}
}
