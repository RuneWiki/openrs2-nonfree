import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!r", name = "q", descriptor = "Lclient!nj;")
	protected Class137 aClass137_41;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!i;")
	protected Class88 aClass88_41;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	public int anInt6821;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "[Lclient!r;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
	public boolean aBoolean597;

	static {
		new Class93("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
		this.aBoolean597 = arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public void method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6821 == 255 ? arg0 : this.anInt6821;
		if (this.aBoolean597) {
			this.aClass137_41 = new Class137(local14, arg0, arg1);
		} else {
			this.aClass88_41 = new Class88(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)[I")
	protected final int[] method5876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array42[arg0].aBoolean597 ? this.aClass2_Sub2Array42[arg0].method5883(arg1) : this.aClass2_Sub2Array42[arg0].method5884(arg1)[0];
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public void method5877() {
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public void method5878() {
		if (this.aBoolean597) {
			this.aClass137_41.method3809();
			this.aClass137_41 = null;
		} else {
			this.aClass88_41.method2628();
			this.aClass88_41 = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I")
	public int method5879() {
		return -1;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
	public int method5881() {
		return -1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!dg;I)V")
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	public int[] method5883(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[[I")
	public int[][] method5884(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IBI)[[I")
	protected final int[][] method5887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub2Array42[arg1].aBoolean597) {
			@Pc(22) int[] local22 = this.aClass2_Sub2Array42[arg1].method5883(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub2Array42[arg1].method5884(arg0);
		}
	}
}
