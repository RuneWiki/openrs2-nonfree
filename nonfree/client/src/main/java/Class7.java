import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class7 {

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "Lclient!vh;")
	private final Class330 aClass330_2 = new Class330(64);

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
	public int anInt100 = 0;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Lclient!pj;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
	public final int anInt97;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class7(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_1 = arg2;
		this.anInt97 = this.aClass248_1.method5793(4);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)Lclient!jp;")
	public Class159 method89(@OriginalArg(1) int arg0) {
		@Pc(11) Class330 local11 = this.aClass330_2;
		@Pc(21) Class159 local21;
		synchronized (this.aClass330_2) {
			local21 = (Class159) this.aClass330_2.method7677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class248 local34 = this.aClass248_1;
		@Pc(43) byte[] local43;
		synchronized (this.aClass248_1) {
			local43 = this.aClass248_1.method5797(4, arg0);
		}
		local21 = new Class159();
		local21.anInt4620 = arg0;
		local21.aClass7_3 = this;
		if (local43 != null) {
			local21.method3923(new Class6_Sub12(local43));
		}
		local21.method3925();
		@Pc(74) Class330 local74 = this.aClass330_2;
		synchronized (this.aClass330_2) {
			this.aClass330_2.method7676(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)V")
	public void method90() {
		@Pc(6) Class330 local6 = this.aClass330_2;
		synchronized (this.aClass330_2) {
			this.aClass330_2.method7680(5);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public void method91() {
		@Pc(2) Class330 local2 = this.aClass330_2;
		synchronized (this.aClass330_2) {
			this.aClass330_2.method7688();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V")
	public void method92() {
		@Pc(6) Class330 local6 = this.aClass330_2;
		synchronized (this.aClass330_2) {
			this.aClass330_2.method7678();
		}
	}
}
