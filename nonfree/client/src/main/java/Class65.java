import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class65 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public int anInt1374;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
	public int anInt1376;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public int anInt1373 = 128;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	public int anInt1378 = 128;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
	public Class65(@OriginalArg(0) int arg0) {
		this.anInt1379 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIII)V")
	private Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1372 = arg4;
		this.anInt1373 = arg2;
		this.anInt1378 = arg1;
		this.anInt1379 = arg0;
		this.anInt1374 = arg5;
		this.anInt1376 = arg3;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Lclient!cs;")
	public Class65 method1215() {
		return new Class65(this.anInt1379, this.anInt1378, this.anInt1373, this.anInt1376, this.anInt1372, this.anInt1374);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!cs;)V")
	public void method1216(@OriginalArg(1) Class65 arg0) {
		this.anInt1373 = arg0.anInt1373;
		this.anInt1378 = arg0.anInt1378;
		this.anInt1376 = arg0.anInt1376;
		this.anInt1374 = arg0.anInt1374;
		this.anInt1379 = arg0.anInt1379;
		this.anInt1372 = arg0.anInt1372;
	}
}
