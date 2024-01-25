import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class133 {

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Lclient!dc;")
	private final Class44 aClass44_26 = new Class44(16);

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!he;")
	private final Class100 aClass100_35;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class133(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_35 = arg2;
		this.aClass100_35.method2523(29);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ev;IIII)Lclient!ho;")
	public Class107 method3056(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class139[] local7 = null;
		@Pc(19) Class172 local19 = this.method3057(arg0);
		if (local19.anIntArray326 != null) {
			local7 = new Class139[local19.anIntArray326.length];
			for (@Pc(29) int local29 = 0; local29 < local7.length; local29++) {
				@Pc(39) Class20 local39 = arg1.method1825(local19.anIntArray326[local29]);
				local7[local29] = new Class139(local39.anInt761, local39.anInt762, local39.anInt765, local39.anInt769, local39.anInt767, local39.anInt766, local39.anInt764, local39.aBoolean35);
			}
		}
		return new Class107(local19.anInt4873, local7, local19.anInt4868, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Lclient!nl;")
	private Class172 method3057(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_26;
		@Pc(16) Class172 local16;
		synchronized (this.aClass44_26) {
			local16 = (Class172) this.aClass44_26.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass100_35.method2520(arg0, 29);
		local16 = new Class172();
		if (local41 != null) {
			local16.method4093(new Class6_Sub1(local41));
		}
		@Pc(57) Class44 local57 = this.aClass44_26;
		synchronized (this.aClass44_26) {
			this.aClass44_26.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method3058() {
		@Pc(6) Class44 local6 = this.aClass44_26;
		synchronized (this.aClass44_26) {
			this.aClass44_26.method1348();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public void method3062() {
		@Pc(11) Class44 local11 = this.aClass44_26;
		synchronized (this.aClass44_26) {
			this.aClass44_26.method1351();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)V")
	public void method3064() {
		@Pc(13) Class44 local13 = this.aClass44_26;
		synchronized (this.aClass44_26) {
			this.aClass44_26.method1352(5);
		}
	}
}
