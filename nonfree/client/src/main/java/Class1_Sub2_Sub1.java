import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Lclient!l;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "Lclient!dj;")
	private Class24 aClass24_28 = Static41.aClass24_367;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!fj;I)V")
	private void method80(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt102 = arg1.method2771();
		} else if (arg0 == 2) {
			this.anInt109 = arg1.method2771();
		} else if (arg0 == 3) {
			this.aClass24_28 = arg1.method2761();
		} else if (arg0 == 4) {
			this.anInt106 = arg1.method2793();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(55) int local55 = arg1.method2765();
			this.aClass57_3 = new Class57(Static208.method3518(local55));
			for (@Pc(65) int local65 = 0; local65 < local55; local65++) {
				@Pc(70) int local70 = arg1.method2793();
				@Pc(82) Class1 local82;
				if (arg0 == 5) {
					local82 = new Class1_Sub21(arg1.method2761());
				} else {
					local82 = new Class1_Sub24(arg1.method2793());
				}
				this.aClass57_3.method1874(local82, (long) local70);
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!fj;)V")
	public void method81(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2771();
			if (local3 == 0) {
				return;
			}
			this.method80(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(II)I")
	public int method82(@OriginalArg(1) int arg0) {
		if (this.aClass57_3 == null) {
			return this.anInt106;
		} else {
			@Pc(24) Class1_Sub24 local24 = (Class1_Sub24) this.aClass57_3.method1872((long) arg0);
			return local24 == null ? this.anInt106 : local24.anInt4339;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lclient!dj;")
	public Class24 method90(@OriginalArg(1) int arg0) {
		if (this.aClass57_3 == null) {
			return this.aClass24_28;
		} else {
			@Pc(17) Class1_Sub21 local17 = (Class1_Sub21) this.aClass57_3.method1872((long) arg0);
			return local17 == null ? this.aClass24_28 : local17.aClass24_971;
		}
	}
}
