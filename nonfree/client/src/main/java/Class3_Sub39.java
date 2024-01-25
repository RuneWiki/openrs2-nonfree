import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
	public final int anInt8044;

	@OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
	public final int anInt8046;

	@OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
	public final int anInt8038;

	@OriginalMember(owner = "client!oha", name = "v", descriptor = "I")
	public final int anInt8043;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
	public final int anInt8035;

	@OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
	public final int anInt8041;

	@OriginalMember(owner = "client!oha", name = "n", descriptor = "I")
	public final int anInt8037;

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
	public final int anInt8039;

	@OriginalMember(owner = "client!oha", name = "p", descriptor = "I")
	public final int anInt8036;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class3_Sub39(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(5) int local5 = arg0.method5312();
		this.anInt8044 = local5 >>> 28;
		this.anInt8046 = local5 >>> 14 & 0x3FFF;
		this.anInt8038 = local5 & 0x3FFF;
		this.anInt8043 = arg0.method5322(-38);
		this.anInt8035 = arg0.method5322(-118);
		this.anInt8041 = arg0.method5322(-11);
		this.anInt8037 = arg0.method5322(-93);
		this.anInt8039 = arg0.method5322(-60);
		this.anInt8036 = arg0.method5322(-8);
	}
}
