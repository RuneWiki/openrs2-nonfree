import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class357 implements Interface4 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!da;")
	private Class25 aClass25_12;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Lclient!la;")
	private final Class192 aClass192_1;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Lclient!kha;")
	private final Class181 aClass181_125;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!kha;")
	private final Class181 aClass181_124;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!la;)V")
	public Class357(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class192 arg2) {
		this.aClass192_1 = arg2;
		this.aClass181_125 = arg1;
		this.aClass181_124 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass181_124.method5040(this.aClass192_1.anInt6140)) {
			local11 = false;
		}
		if (!this.aClass181_125.method5040(this.aClass192_1.anInt6140)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
		@Pc(11) Class315 local11 = Static494.method7247(this.aClass181_125, this.aClass192_1.anInt6140);
		this.aClass25_12 = Static47.aClass33_3.method6202(local11, Static649.method617(this.aClass181_124, this.aClass192_1.anInt6140));
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		@Pc(15) int local15 = this.aClass192_1.aClass117_10.method3782(Static199.anInt4634, this.aClass192_1.anInt6133) + this.aClass192_1.anInt6141;
		@Pc(30) int local30 = this.aClass192_1.aClass178_9.method5000(this.aClass192_1.anInt6132, Static523.anInt9075) + this.aClass192_1.anInt6143;
		this.aClass25_12.method5857(local15, this.aClass192_1.anInt6133, this.aClass192_1.anInt6136, this.aClass192_1.anInt6142, null, this.aClass192_1.anInt6132, this.aClass192_1.anInt6135, this.aClass192_1.aString65, null, this.aClass192_1.anInt6138, null, local30, this.aClass192_1.anInt6139, 0, 0);
	}
}
