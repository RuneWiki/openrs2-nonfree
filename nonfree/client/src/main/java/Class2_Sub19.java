import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "Z")
	public boolean aBoolean259;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "Lclient!ef;")
	protected final Class49_Sub2 aClass49_Sub2_17;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class2_Sub19(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_17 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z")
	public abstract boolean method2767();

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)I")
	public final int method2769() {
		return 1;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
	public abstract void method2772();

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Z")
	public abstract boolean method2773();

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I")
	public int method2774() {
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	public abstract void method2775(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public abstract void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)Z")
	public final boolean method2777() {
		return this.aBoolean259;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)Z")
	public final boolean method2778() {
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!ml;ILclient!ml;)V")
	public abstract void method2779(@OriginalArg(0) int arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(3) Class55_Sub3 arg2);
}
