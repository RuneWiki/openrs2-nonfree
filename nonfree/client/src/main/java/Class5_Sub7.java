import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!u;")
	public Class5_Sub7 aClass5_Sub7_8;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!je;")
	public Class5_Sub5 aClass5_Sub5_5;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public int anInt2932;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Z")
	public volatile boolean aBoolean128 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V")
	protected final void method2020(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean128) {
			this.method2025(arg0, arg1, arg2);
		} else {
			this.method2023(arg2);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()I")
	public abstract int method2021();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	public int method2022() {
		return 255;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public abstract void method2023(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()Lclient!u;")
	public abstract Class5_Sub7 method2024();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "([III)V")
	public abstract void method2025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()Lclient!u;")
	public abstract Class5_Sub7 method2026();
}
