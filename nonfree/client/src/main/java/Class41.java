import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class41 {

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "Lclient!wg;")
	private final Class313 aClass313_5 = new Class313(16);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!kr;")
	private final Class171 aClass171_26;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class41(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_26 = arg2;
		this.aClass171_26.method4349(29);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public void method1030() {
		@Pc(10) Class313 local10 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method7398();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILclient!el;II)Lclient!hb;")
	public Class117 method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class174[] local7 = null;
		@Pc(16) Class168 local16 = this.method1038(arg1);
		if (local16.anIntArray514 != null) {
			local7 = new Class174[local16.anIntArray514.length];
			for (@Pc(26) int local26 = 0; local26 < local7.length; local26++) {
				@Pc(38) Class116 local38 = arg2.method1912(local16.anIntArray514[local26]);
				local7[local26] = new Class174(local38.anInt3075, local38.anInt3084, local38.anInt3080, local38.anInt3081, local38.anInt3079, local38.anInt3077, local38.anInt3076, local38.aBoolean213);
			}
		}
		return new Class117(local16.anInt4962, local7, local16.anInt4957, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public void method1034() {
		@Pc(14) Class313 local14 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method7400();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V")
	public void method1035() {
		@Pc(6) Class313 local6 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method7403(5);
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)Lclient!kn;")
	private Class168 method1038(@OriginalArg(1) int arg0) {
		@Pc(12) Class313 local12 = this.aClass313_5;
		@Pc(22) Class168 local22;
		synchronized (this.aClass313_5) {
			local22 = (Class168) this.aClass313_5.method7406((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class171 local35 = this.aClass171_26;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_26) {
			local44 = this.aClass171_26.method4339(29, arg0);
		}
		local22 = new Class168();
		if (local44 != null) {
			local22.method4294(new Class1_Sub6(local44));
		}
		@Pc(66) Class313 local66 = this.aClass313_5;
		synchronized (this.aClass313_5) {
			this.aClass313_5.method7399((long) arg0, local22);
			return local22;
		}
	}
}
