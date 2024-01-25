import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!b", name = "C", descriptor = "Lclient!wh;")
	private Class356 aClass356_3;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!io;)V")
	public void method768(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4393();
			if (local11 == 0) {
				return;
			}
			this.method772(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(ZII)I")
	public int method769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass356_3 == null) {
			return arg0;
		} else {
			@Pc(25) Class1_Sub32 local25 = (Class1_Sub32) this.aClass356_3.method7796((long) arg1);
			return local25 == null ? arg0 : local25.anInt6144;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method770(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass356_3 == null) {
			return arg1;
		} else {
			@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) this.aClass356_3.method7796((long) arg0);
			return local23 == null ? arg1 : local23.aString60;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!io;II)V")
	private void method772(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(8) int local8 = arg0.method4393();
		@Pc(15) int local15;
		if (this.aClass356_3 == null) {
			local15 = Static200.method3428(local8);
			this.aClass356_3 = new Class356(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(34) boolean local34 = arg0.method4393() == 1;
			@Pc(38) int local38 = arg0.method4396();
			@Pc(47) Class1 local47;
			if (local34) {
				local47 = new Class1_Sub26(arg0.method4388());
			} else {
				local47 = new Class1_Sub32(arg0.method4371());
			}
			this.aClass356_3.method7800((long) local38, local47);
		}
	}
}
