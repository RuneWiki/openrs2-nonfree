import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class35 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!jp;")
	private final Class129 aClass129_6 = new Class129(16);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!pc;")
	private final Class188 aClass188_24;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class35(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_24 = arg2;
		this.aClass188_24.method4285(29);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!iu;IIBII)Lclient!uh;")
	public Class243 method991(@OriginalArg(0) Class123 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class219[] local12 = null;
		@Pc(19) Class220 local19 = this.method994(arg2);
		if (local19.anIntArray421 != null) {
			local12 = new Class219[local19.anIntArray421.length];
			for (@Pc(29) int local29 = 0; local29 < local12.length; local29++) {
				@Pc(39) Class5 local39 = arg0.method2818(local19.anIntArray421[local29]);
				local12[local29] = new Class219(local39.anInt166, local39.anInt167, local39.anInt156, local39.anInt165, local39.anInt161, local39.anInt159, local39.anInt164, local39.aBoolean16);
			}
		}
		return new Class243(local19.anInt6292, local12, local19.anInt6293, arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public void method992() {
		@Pc(2) Class129 local2 = this.aClass129_6;
		synchronized (this.aClass129_6) {
			this.aClass129_6.method3025();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public void method993() {
		@Pc(2) Class129 local2 = this.aClass129_6;
		synchronized (this.aClass129_6) {
			this.aClass129_6.method3028(5);
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Lclient!se;")
	private Class220 method994(@OriginalArg(0) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_6;
		@Pc(18) Class220 local18;
		synchronized (this.aClass129_6) {
			local18 = (Class220) this.aClass129_6.method3023((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass188_24.method4283(29, arg0);
		local18 = new Class220();
		if (local35 != null) {
			local18.method4992(new Class2_Sub20(local35));
		}
		@Pc(53) Class129 local53 = this.aClass129_6;
		synchronized (this.aClass129_6) {
			this.aClass129_6.method3029(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public void method995() {
		@Pc(14) Class129 local14 = this.aClass129_6;
		synchronized (this.aClass129_6) {
			this.aClass129_6.method3026();
		}
	}
}
