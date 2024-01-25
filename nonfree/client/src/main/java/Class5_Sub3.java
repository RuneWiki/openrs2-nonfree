import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public abstract class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!tb;")
	protected Class188 aClass188_41;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "Lclient!dq;")
	protected Class53 aClass53_41;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
	public int anInt6801;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "Z")
	public boolean aBoolean592;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "[Lclient!sp;")
	public final Class5_Sub3[] aClass5_Sub3Array42;

	static {
		new Class85("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean592 = arg1;
		this.aClass5_Sub3Array42 = new Class5_Sub3[arg0];
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	public void method6010() {
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)[I")
	public int[] method6011(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)I")
	public int method6012() {
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V")
	public void method6013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6801 == 255 ? arg1 : this.anInt6801;
		if (this.aBoolean592) {
			this.aClass188_41 = new Class188(local14, arg1, arg0);
		} else {
			this.aClass53_41 = new Class53(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	public void method6014() {
		if (this.aBoolean592) {
			this.aClass188_41.method5317();
			this.aClass188_41 = null;
		} else {
			this.aClass53_41.method966();
			this.aClass53_41 = null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)[[I")
	public int[][] method6016(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!rg;BI)V")
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)[I")
	protected final int[] method6020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass5_Sub3Array42[arg0].aBoolean592 ? this.aClass5_Sub3Array42[arg0].method6011(arg1) : this.aClass5_Sub3Array42[arg0].method6016(arg1)[0];
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I")
	public int method6021() {
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method6023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub3Array42[arg0].aBoolean592) {
			@Pc(22) int[] local22 = this.aClass5_Sub3Array42[arg0].method6011(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass5_Sub3Array42[arg0].method6016(arg1);
		}
	}
}
