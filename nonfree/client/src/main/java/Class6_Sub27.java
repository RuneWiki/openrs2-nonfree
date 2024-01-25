import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!pea;")
	protected final Class121_Sub3 aClass121_Sub3_30;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class6_Sub27(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_30 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I")
	public final int method4962() {
		return 1;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)Z")
	public final boolean method4963() {
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public abstract boolean method4964();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Z")
	public final boolean method4966() {
		return this.aBoolean370;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V")
	public abstract void method4967();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!qw;Lclient!qw;II)V")
	public abstract void method4968(@OriginalArg(0) Class35_Sub3 arg0, @OriginalArg(1) Class35_Sub3 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I")
	public int method4970() {
		return 0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public abstract void method4971(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBI)V")
	public abstract void method4972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(Z)Z")
	public abstract boolean method4973();
}
