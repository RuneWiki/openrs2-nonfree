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

@OriginalClass("client!gn")
public final class Class3_Sub14_Sub2 extends Class3_Sub14 {

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	private int anInt3608;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "Lclient!lt;")
	private Class217 aClass217_5;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	private VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "Lclient!wo;")
	private Class3_Sub12_Sub5 aClass3_Sub12_Sub5_1;

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	private DSPState aDSPState1;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	private final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	private final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class3_Sub14_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method7821(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9591 < 3) {
			@Pc(16) int local16 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local16 < 0) {
				throw new IllegalStateException(String.valueOf(local16));
			}
			if (super.anInt9591 == 2) {
				if (this.aVorbisInfo1.channels > 2 || this.aVorbisInfo1.channels < 1) {
					throw new RuntimeException(String.valueOf(this.aVorbisInfo1.channels));
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass217_5 = new Class217(this.aVorbisInfo1.rate, Static16.anInt10139);
				this.aClass3_Sub12_Sub5_1 = new Class3_Sub12_Sub5(this.aVorbisInfo1.channels);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(98) float[][] local98 = this.aDSPState1.pcmOut(this.aVorbisInfo1.channels);
		this.aDouble12 = this.aDSPState1.granuleTime();
		if (this.aDouble12 == -1.0D) {
			this.aDouble12 = (double) ((float) this.anInt3608 / (float) this.aVorbisInfo1.rate);
		}
		this.aDSPState1.read(local98[0].length);
		this.anInt3608 += local98[0].length;
		@Pc(146) Class3_Sub5_Sub15 local146 = this.aClass3_Sub12_Sub5_1.method8949(local98[0].length, this.aDouble12);
		Static59.method1092(local146.aShortArrayArray6, local98);
		for (@Pc(154) int local154 = 0; local154 < this.aVorbisInfo1.channels; local154++) {
			local146.aShortArrayArray6[local154] = this.aClass217_5.method5102(local146.aShortArrayArray6[local154]);
		}
		this.aClass3_Sub12_Sub5_1.method8957(local146);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)I")
	public int method3082() {
		return this.aClass3_Sub12_Sub5_1 == null ? 0 : this.aClass3_Sub12_Sub5_1.method8955();
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)D")
	public double method3085() {
		@Pc(12) double local12 = this.aDouble12;
		if (this.aClass3_Sub12_Sub5_1 != null) {
			local12 = this.aClass3_Sub12_Sub5_1.method8951();
			if (local12 < 0.0D) {
				local12 = this.aDouble12;
			}
		}
		return (double) -(256.0F / (float) Static16.anInt10139) + local12;
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)Lclient!wo;")
	public Class3_Sub12_Sub5 method3086() {
		return this.aClass3_Sub12_Sub5_1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	@Override
	public void method7818() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.b();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.b();
		}
		this.aVorbisComment1.b();
		this.aVorbisInfo1.b();
		if (this.aClass3_Sub12_Sub5_1 != null) {
			this.aClass3_Sub12_Sub5_1.method8960();
		}
	}
}
