import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class5_Sub34_Sub2 extends Class5_Sub34 {

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	private int anInt6327;

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "F")
	private float aFloat98;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "F")
	private float aFloat100;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
	private int anInt6336;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub34_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)F")
	public float method5609() {
		return this.aFloat100;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method5611() {
		return this.aString70;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)F")
	public float method5612() {
		return this.aFloat98;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;B)V")
	@Override
	protected void method8629(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt10097 > 0 && !"SUB".equals(this.aString71)) {
			return;
		}
		@Pc(24) Class5_Sub22 local24 = new Class5_Sub22(arg0.getData());
		@Pc(28) int local28 = local24.method5966();
		if (super.anInt10097 > 8) {
			if (local28 == 0) {
				@Pc(125) long local125 = local24.method5930();
				@Pc(129) long local129 = local24.method5930();
				@Pc(133) long local133 = local24.method5930();
				if (local125 < 0L || local129 < 0L || local133 < 0L || local125 < local133) {
					throw new IllegalStateException();
				}
				this.aFloat100 = (float) ((long) this.anInt6336 * local125) / (float) this.anInt6327;
				this.aFloat98 = (float) ((long) this.anInt6336 * (local129 + local125)) / (float) this.anInt6327;
				@Pc(187) int local187 = local24.method5911();
				if (local187 < 0 || local187 > local24.aByteArray71.length - local24.anInt6629) {
					throw new IllegalStateException();
				}
				this.aString72 = Static206.method3568(local24.aByteArray71, local24.anInt6629, local187);
			}
			if ((local28 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local28 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt10097 != 0) {
			return;
		}
		local24.anInt6629 += 23;
		this.anInt6327 = local24.method5911();
		this.anInt6336 = local24.method5911();
		if (this.anInt6327 != 0 && this.anInt6336 != 0) {
			@Pc(87) Class5_Sub22 local87 = new Class5_Sub22(16);
			local24.method5915(0, 16, local87.aByteArray71);
			this.aString70 = local87.method5937();
			local87.anInt6629 = 0;
			local24.method5915(0, 16, local87.aByteArray71);
			this.aString71 = local87.method5937();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method5613() {
		return this.aString72;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	@Override
	public void method8632() {
	}
}
