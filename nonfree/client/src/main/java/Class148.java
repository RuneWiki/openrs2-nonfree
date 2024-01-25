import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class148 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
	public static final int[] anIntArray184 = new int[128];

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!iha;")
	private final Class168 aClass168_38 = new Class168(64);

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!gda;")
	private final Class126 aClass126_108;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!gj;")
	public final Class133 aClass133_2;

	static {
		for (@Pc(61) int local61 = 0; local61 < anIntArray184.length; local61++) {
			anIntArray184[local61] = -1;
		}
		for (@Pc(73) int local73 = 65; local73 <= 90; local73++) {
			anIntArray184[local73] = local73 - 65;
		}
		for (@Pc(88) int local88 = 97; local88 <= 122; local88++) {
			anIntArray184[local88] = local88 + 26 - 97;
		}
		for (@Pc(105) int local105 = 48; local105 <= 57; local105++) {
			anIntArray184[local105] = local105 + 52 - 48;
		}
		anIntArray184[45] = anIntArray184[47] = 63;
		anIntArray184[42] = anIntArray184[43] = 62;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gj;)V")
	public Class148(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class133 arg3) {
		this.aClass126_108 = arg2;
		this.aClass126_108.method3062(32);
		this.aClass133_2 = arg3;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public void method3402() {
		@Pc(6) Class168 local6 = this.aClass168_38;
		synchronized (this.aClass168_38) {
			this.aClass168_38.method3856();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lclient!ee;")
	public Class92 method3404(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_38;
		@Pc(16) Class92 local16;
		synchronized (this.aClass168_38) {
			local16 = (Class92) this.aClass168_38.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class126 local38 = this.aClass126_108;
		@Pc(47) byte[] local47;
		synchronized (this.aClass126_108) {
			local47 = this.aClass126_108.method3086(arg0, 32);
		}
		local16 = new Class92();
		local16.aClass148_1 = this;
		if (local47 != null) {
			local16.method1748(new Class5_Sub36(local47));
		}
		@Pc(74) Class168 local74 = this.aClass168_38;
		synchronized (this.aClass168_38) {
			this.aClass168_38.method3853((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public void method3405() {
		@Pc(2) Class168 local2 = this.aClass168_38;
		synchronized (this.aClass168_38) {
			this.aClass168_38.method3862();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V")
	public void method3406() {
		@Pc(6) Class168 local6 = this.aClass168_38;
		synchronized (this.aClass168_38) {
			this.aClass168_38.method3852(5);
		}
	}
}
