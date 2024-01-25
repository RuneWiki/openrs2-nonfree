import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class159 {

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
	private int anInt3986;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!gca;")
	private Class118 aClass118_23;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "Lclient!gca;")
	public Class118 aClass118_24;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Ljava/lang/String;")
	private String aString39 = "null";

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method3414(@OriginalArg(1) int arg0) {
		if (this.aClass118_24 == null) {
			return this.aString39;
		} else {
			@Pc(23) Class2_Sub29 local23 = (Class2_Sub29) this.aClass118_24.method2595((long) arg0);
			return local23 == null ? this.aString39 : local23.aString63;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
	private void method3419() {
		this.aClass118_23 = new Class118(this.aClass118_24.method2593());
		for (@Pc(28) Class2_Sub29 local28 = (Class2_Sub29) this.aClass118_24.method2596(); local28 != null; local28 = (Class2_Sub29) this.aClass118_24.method2597()) {
			@Pc(39) Class2_Sub37 local39 = new Class2_Sub37(local28.aString63, (int) local28.aLong280);
			this.aClass118_23.method2601(local39, Static34.method591(local28.aString63));
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Z")
	public boolean method3420(@OriginalArg(1) int arg0) {
		if (this.aClass118_24 == null) {
			return false;
		}
		if (this.aClass118_23 == null) {
			this.method3425();
		}
		@Pc(30) Class2_Sub30 local30 = (Class2_Sub30) this.aClass118_23.method2595((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method3421(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method3422(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IBLclient!vj;)V")
	private void method3422(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static212.method2950(arg1.method8548());
		} else if (arg0 == 2) {
			this.aChar2 = Static212.method2950(arg1.method8548());
		} else if (arg0 == 3) {
			this.aString39 = arg1.method8549();
		} else if (arg0 == 4) {
			this.anInt3986 = arg1.method8542();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(42) int local42 = arg1.method8546();
			this.aClass118_24 = new Class118(Static350.method4699(local42));
			for (@Pc(52) int local52 = 0; local52 < local42; local52++) {
				@Pc(58) int local58 = arg1.method8542();
				@Pc(70) Class2 local70;
				if (arg0 == 5) {
					local70 = new Class2_Sub29(arg1.method8549());
				} else {
					local70 = new Class2_Sub30(arg1.method8542());
				}
				this.aClass118_24.method2601(local70, (long) local58);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3423(@OriginalArg(0) String arg0) {
		if (this.aClass118_24 == null) {
			return false;
		}
		if (this.aClass118_23 == null) {
			this.method3419();
		}
		for (@Pc(32) Class2_Sub37 local32 = (Class2_Sub37) this.aClass118_23.method2595(Static34.method591(arg0)); local32 != null; local32 = (Class2_Sub37) this.aClass118_23.method2605()) {
			if (local32.aString95.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(BI)I")
	public int method3424(@OriginalArg(1) int arg0) {
		if (this.aClass118_24 == null) {
			return this.anInt3986;
		} else {
			@Pc(17) Class2_Sub30 local17 = (Class2_Sub30) this.aClass118_24.method2595((long) arg0);
			return local17 == null ? this.anInt3986 : local17.anInt5508;
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	private void method3425() {
		this.aClass118_23 = new Class118(this.aClass118_24.method2593());
		for (@Pc(25) Class2_Sub30 local25 = (Class2_Sub30) this.aClass118_24.method2596(); local25 != null; local25 = (Class2_Sub30) this.aClass118_24.method2597()) {
			@Pc(34) Class2_Sub30 local34 = new Class2_Sub30((int) local25.aLong280);
			this.aClass118_23.method2601(local34, (long) local25.anInt5508);
		}
	}
}
