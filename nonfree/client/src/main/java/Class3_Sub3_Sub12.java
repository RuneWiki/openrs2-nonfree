import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub3_Sub12 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Lclient!jr;")
	private Class127 aClass127_18;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!bt;)V")
	private void method2962(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(6) int local6 = arg1.method6053();
		@Pc(13) int local13;
		if (this.aClass127_18 == null) {
			local13 = Static350.method4984(local6);
			this.aClass127_18 = new Class127(local13);
		}
		for (local13 = 0; local13 < local6; local13++) {
			@Pc(31) boolean local31 = arg1.method6053() == 1;
			@Pc(37) int local37 = arg1.method6020();
			@Pc(48) Class3 local48;
			if (local31) {
				local48 = new Class3_Sub37(arg1.method6027());
			} else {
				local48 = new Class3_Sub25(arg1.method6014());
			}
			this.aClass127_18.method3257((long) local37, local48);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method2964(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass127_18 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub37 local22 = (Class3_Sub37) this.aClass127_18.method3246((long) arg1);
			return local22 == null ? arg0 : local22.aString58;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
	public int method2965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass127_18 == null) {
			return arg1;
		} else {
			@Pc(24) Class3_Sub25 local24 = (Class3_Sub25) this.aClass127_18.method3246((long) arg0);
			return local24 == null ? arg1 : local24.anInt4134;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!bt;)V")
	public void method2967(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6053();
			if (local7 == 0) {
				return;
			}
			this.method2962(local7, arg0);
		}
	}
}
