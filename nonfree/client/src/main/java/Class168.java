import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class168 {

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Lclient!ff;")
	private final Class83 aClass83_39 = new Class83(16);

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_57;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class168(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_57 = arg2;
		this.aClass250_57.method5653(29);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lclient!sp;")
	private Class217 method3936(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_39;
		@Pc(16) Class217 local16;
		synchronized (this.aClass83_39) {
			local16 = (Class217) this.aClass83_39.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_57.method5667(arg0, 29);
		local16 = new Class217();
		if (local33 != null) {
			local16.method5094(new Class1_Sub1(local33));
		}
		@Pc(51) Class83 local51 = this.aClass83_39;
		synchronized (this.aClass83_39) {
			this.aClass83_39.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!jp;IIIII)Lclient!md;")
	public Class154 method3938(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class257[] local12 = null;
		@Pc(19) Class217 local19 = this.method3936(arg4);
		if (local19.anIntArray519 != null) {
			local12 = new Class257[local19.anIntArray519.length];
			for (@Pc(29) int local29 = 0; local29 < local12.length; local29++) {
				@Pc(39) Class31 local39 = arg0.method3028(local19.anIntArray519[local29]);
				local12[local29] = new Class257(local39.anInt676, local39.anInt675, local39.anInt669, local39.anInt670, local39.anInt668, local39.anInt674, local39.anInt677, local39.aBoolean20);
			}
		}
		return new Class154(local19.anInt6314, local12, local19.anInt6311, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	public void method3940() {
		@Pc(6) Class83 local6 = this.aClass83_39;
		synchronized (this.aClass83_39) {
			this.aClass83_39.method1663(5);
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	public void method3942() {
		@Pc(11) Class83 local11 = this.aClass83_39;
		synchronized (this.aClass83_39) {
			this.aClass83_39.method1667();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	public void method3944() {
		@Pc(2) Class83 local2 = this.aClass83_39;
		synchronized (this.aClass83_39) {
			this.aClass83_39.method1669();
		}
	}
}
