import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class67 {

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
	public static final int[] anIntArray154 = new int[256];

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!ff;")
	private final Class83 aClass83_13 = new Class83(256);

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_11;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!m;")
	private final Interface7 anInterface7_4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray154[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!ht;Lclient!m;)V")
	public Class67(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass109_Sub1_11 = arg0;
		this.anInterface7_4 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lclient!qv;")
	public Class13_Sub1 method1466(@OriginalArg(1) int arg0) {
		@Pc(14) Object local14 = this.aClass83_13.method1658((long) arg0);
		if (local14 != null) {
			return (Class13_Sub1) local14;
		} else if (this.anInterface7_4.method4837(arg0)) {
			@Pc(40) Class151 local40 = this.anInterface7_4.method4836(arg0);
			@Pc(49) int local49 = local40.aBoolean295 ? 64 : this.aClass109_Sub1_11.anInt2972;
			@Pc(111) Class13_Sub1 local111;
			if (local40.aBoolean292 && this.aClass109_Sub1_11.method4687()) {
				@Pc(123) float[] local123 = this.anInterface7_4.method4838(local49, 0.7F, local49, arg0);
				local111 = new Class13_Sub1(this.aClass109_Sub1_11, 3553, 34842, local49, local49, local40.aByte54 != 0, local123, 6408);
			} else {
				@Pc(76) short local76;
				@Pc(74) int[] local74;
				if (local40.aBoolean296 && Static412.method5567(local40.aByte52)) {
					local74 = this.anInterface7_4.method4839(false, local49, 0.7F, local49, arg0);
					local76 = 6407;
				} else {
					local76 = 6408;
					local74 = this.anInterface7_4.method4840(0.7F, arg0, local49, local49);
				}
				local111 = new Class13_Sub1(this.aClass109_Sub1_11, 3553, local76, local49, local49, local40.aByte54 != 0, local74, false);
			}
			local111.method1055(local40.aBoolean288, local40.aBoolean290);
			this.aClass83_13.method1675((long) arg0, local111);
			return local111;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public void method1468() {
		this.aClass83_13.method1663(5);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public void method1469() {
		this.aClass83_13.method1669();
	}
}
