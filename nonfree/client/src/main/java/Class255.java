import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public abstract class Class255 implements Interface23 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!kda;")
	protected final Class101 aClass101_4;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!kda;)V")
	protected Class255(@OriginalArg(0) Class101 arg0) {
		this.aClass101_4 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZZI)V")
	protected abstract void method8050(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method8047() {
		@Pc(23) int local23 = this.aClass101_4.aClass148_10.method3982(Static419.anInt7811, this.aClass101_4.anInt9016) + this.aClass101_4.anInt9011;
		@Pc(37) int local37 = this.aClass101_4.aClass49_11.method1326(Static79.anInt9888, this.aClass101_4.anInt9009) + this.aClass101_4.anInt9013;
		this.method8050(local37, local23);
		this.method8055(local23, local37);
		Static489.aClass73_5.method7892(local23 + this.aClass101_4.anInt9016 / 2, this.aClass101_4.anInt9009 / 2 + local37 - -4, Static510.aString75, this.aClass101_4.anInt9010, -1);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BZII)V")
	protected abstract void method8055(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public abstract void method8048();

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)Z")
	public abstract boolean method8049();
}
