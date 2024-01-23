import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "Lclient!vl;")
	private Class186 aClass186_2;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!qm;)V")
	private void method356(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(9) int local9 = arg1.method2199();
		@Pc(18) int local18;
		if (this.aClass186_2 == null) {
			local18 = Static315.method4766(local9);
			this.aClass186_2 = new Class186(local18);
		}
		for (local18 = 0; local18 < local9; local18++) {
			@Pc(44) boolean local44 = arg1.method2199() == 1;
			@Pc(48) int local48 = arg1.method2215();
			@Pc(57) Class1 local57;
			if (local44) {
				local57 = new Class1_Sub18(arg1.method2237());
			} else {
				local57 = new Class1_Sub17(arg1.method2194());
			}
			this.aClass186_2.method4575((long) local48, local57);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZ)I")
	public int method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass186_2 == null) {
			return arg1;
		} else {
			@Pc(24) Class1_Sub17 local24 = (Class1_Sub17) this.aClass186_2.method4570((long) arg0);
			return local24 == null ? arg1 : local24.anInt3669;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qm;B)V")
	public void method359(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method356(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method360(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass186_2 == null) {
			return arg0;
		} else {
			@Pc(23) Class1_Sub18 local23 = (Class1_Sub18) this.aClass186_2.method4570((long) arg1);
			return local23 == null ? arg0 : local23.aString250;
		}
	}
}
