import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class15_Sub21 extends Class15 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	private final int anInt8399;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	private final int anInt8396;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	private final int anInt8393;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	private final int anInt8392;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	private final int anInt8394;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub21(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt8399 = arg0.method8575();
		@Pc(11) int local11 = arg0.method8555(-9372);
		this.anInt8396 = local11 & 0xFFFF;
		this.anInt8393 = local11 >>> 16;
		this.anInt8392 = arg0.method8581(-17416);
		this.anInt8394 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static486.aClass398Array1[this.anInt8399].method9449(this.anInt8393, this.anInt8396, this.anInt8394, this.anInt8392);
	}
}
