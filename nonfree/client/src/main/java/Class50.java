import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class50 {

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public int anInt1454;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
	public int anInt1458;

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
	public int anInt1459;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	public int anInt1463;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public int anInt1465 = 128;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
	public int anInt1464 = 128;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public int anInt1455;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.anInt1455 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIII)V")
	private Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1465 = arg2;
		this.anInt1458 = arg4;
		this.anInt1455 = arg0;
		this.anInt1464 = arg1;
		this.anInt1459 = arg5;
		this.anInt1467 = arg3;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Lclient!cv;")
	public Class50 method1256() {
		return new Class50(this.anInt1455, this.anInt1464, this.anInt1465, this.anInt1467, this.anInt1458, this.anInt1459);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!cv;I)V")
	public void method1257(@OriginalArg(0) Class50 arg0) {
		this.anInt1455 = arg0.anInt1455;
		this.anInt1464 = arg0.anInt1464;
		this.anInt1458 = arg0.anInt1458;
		this.anInt1465 = arg0.anInt1465;
		this.anInt1467 = arg0.anInt1467;
		this.anInt1459 = arg0.anInt1459;
	}
}
