import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "Lclient!sq;")
	private Class214 aClass214_21;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)I")
	public int method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass214_21 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub44 local21 = (Class2_Sub44) this.aClass214_21.method5059((long) arg0);
			return local21 == null ? arg1 : local21.anInt6631;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!lk;B)V")
	public void method3535(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4240();
			if (local5 == 0) {
				return;
			}
			this.method3536(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!lk;)V")
	private void method3536(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(16) int local16 = arg1.method4240();
		@Pc(25) int local25;
		if (this.aClass214_21 == null) {
			local25 = Static353.method5359(local16);
			this.aClass214_21 = new Class214(local25);
		}
		for (local25 = 0; local25 < local16; local25++) {
			@Pc(44) boolean local44 = arg1.method4240() == 1;
			@Pc(48) int local48 = arg1.method4235();
			@Pc(57) Class2 local57;
			if (local44) {
				local57 = new Class2_Sub32(arg1.method4201());
			} else {
				local57 = new Class2_Sub44(arg1.method4239());
			}
			this.aClass214_21.method5065((long) local48, local57);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method3538(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass214_21 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub32 local16 = (Class2_Sub32) this.aClass214_21.method5059((long) arg0);
			return local16 == null ? arg1 : local16.aString49;
		}
	}
}
