import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class155 {

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	protected Class155() {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Z")
	public abstract boolean method3516(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public abstract void method3518();

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Lclient!up;")
	public abstract Class250 method3519();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public abstract void method3520();
}
