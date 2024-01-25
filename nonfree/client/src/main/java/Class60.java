import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class60 {

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Lclient!mga;")
	private final Class223 aClass223_11 = new Class223(16);

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_19;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class60(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_19 = arg2;
		this.aClass31_19.method657(29);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)Lclient!he;")
	private Class137 method1361(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_11;
		@Pc(16) Class137 local16;
		synchronized (this.aClass223_11) {
			local16 = (Class137) this.aClass223_11.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class31 local35 = this.aClass31_19;
		@Pc(48) byte[] local48;
		synchronized (this.aClass31_19) {
			local48 = this.aClass31_19.method667(29, arg0);
		}
		local16 = new Class137();
		if (local48 != null) {
			local16.method3460(new Class4_Sub9(local48));
		}
		@Pc(70) Class223 local70 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIZILclient!fu;I)Lclient!op;")
	public Class255 method1362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class110 arg3, @OriginalArg(5) int arg4) {
		@Pc(13) Class311[] local13 = null;
		@Pc(18) Class137 local18 = this.method1361(arg1);
		if (local18.anIntArray376 != null) {
			local13 = new Class311[local18.anIntArray376.length];
			for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
				@Pc(38) Class341 local38 = arg3.method3077(local18.anIntArray376[local28]);
				local13[local28] = new Class311(local38.anInt9159, local38.anInt9160, local38.anInt9154, local38.anInt9158, local38.anInt9157, local38.anInt9151, local38.anInt9161, local38.aBoolean633);
			}
		}
		return new Class255(local18.anInt3968, local13, local18.anInt3967, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
	public void method1363() {
		@Pc(2) Class223 local2 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method4933(5);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public void method1364() {
		@Pc(10) Class223 local10 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method4932();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public void method1366() {
		@Pc(6) Class223 local6 = this.aClass223_11;
		synchronized (this.aClass223_11) {
			this.aClass223_11.method4941();
		}
	}
}
