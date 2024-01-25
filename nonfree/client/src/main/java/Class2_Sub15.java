import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public abstract class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "Lclient!bo;")
	protected Class38 aClass38_41;

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "Lclient!so;")
	protected Class338 aClass338_41;

	@OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
	public int anInt11361;

	@OriginalMember(owner = "client!ica", name = "B", descriptor = "Z")
	public boolean aBoolean803;

	@OriginalMember(owner = "client!ica", name = "w", descriptor = "[Lclient!ica;")
	public final Class2_Sub15[] aClass2_Sub15Array42;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean803 = arg1;
		this.aClass2_Sub15Array42 = new Class2_Sub15[arg0];
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZLclient!ol;)V")
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZII)V")
	public void method9719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt11361 == 255 ? arg1 : this.anInt11361;
		if (this.aBoolean803) {
			this.aClass338_41 = new Class338(local12, arg1, arg0);
		} else {
			this.aClass38_41 = new Class38(local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public void method9720() {
		if (this.aBoolean803) {
			this.aClass338_41.method8471();
			this.aClass338_41 = null;
		} else {
			this.aClass38_41.method1079();
			this.aClass38_41 = null;
		}
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)V")
	public void method9722() {
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZI)[[I")
	public int[][] method9723(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)[I")
	public int[] method9724(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(III)[I")
	protected final int[] method9725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub15Array42[arg0].aBoolean803 ? this.aClass2_Sub15Array42[arg0].method9724(arg1) : this.aClass2_Sub15Array42[arg0].method9723(arg1)[0];
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
	public int method9726() {
		return -1;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub15Array42[arg0].aBoolean803) {
			@Pc(33) int[] local33 = this.aClass2_Sub15Array42[arg0].method9724(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass2_Sub15Array42[arg0].method9723(arg1);
		}
	}

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)I")
	public int method9728() {
		return -1;
	}
}
