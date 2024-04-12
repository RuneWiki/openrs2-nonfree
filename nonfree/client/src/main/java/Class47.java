import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class47 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt1919 = 0;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_556 = Static12.method257(" (Xskill)2");

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!wc;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_4 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_557 = Static12.method257(")3");

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ja;")
	private final Class2_Sub2 aClass2_Sub2_46 = new Class2_Sub2();

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!oa;")
	private final Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	private int anInt1925;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private final int anInt1924;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ba;")
	private final Class6 aClass6_4;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)Lclient!ja;", line = 19)
	public Class2_Sub2 method1325(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass6_4.method190(arg0);
		if (local16 != null) {
			this.aClass41_2.method1201(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 55)
	public void method1327(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass6_4.method190(arg0);
		if (local16 != null) {
			local16.method1677();
			local16.method1637();
			this.anInt1925++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 119)
	public void method1330() {
		while (true) {
			@Pc(22) Class2_Sub2 local22 = this.aClass41_2.method1202();
			if (local22 == null) {
				this.anInt1925 = this.anInt1924;
				return;
			}
			local22.method1677();
			local22.method1637();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJLclient!ja;)V", line = 232)
	public void method1332(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (this.anInt1925 == 0) {
			@Pc(19) Class2_Sub2 local19 = this.aClass41_2.method1202();
			local19.method1677();
			local19.method1637();
			if (local19 == this.aClass2_Sub2_46) {
				local19 = this.aClass41_2.method1202();
				local19.method1677();
				local19.method1637();
			}
		} else {
			this.anInt1925--;
		}
		this.aClass6_4.method195(arg1, arg0);
		this.aClass41_2.method1201(arg1);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 320)
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt1925 = arg0;
		this.anInt1924 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass6_4 = new Class6(local19);
	}
}
