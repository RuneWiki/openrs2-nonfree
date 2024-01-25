import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!cv;")
	public Class3_Sub12 aClass3_Sub12_6;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!ri;")
	public Class3_Sub9 aClass3_Sub9_8;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public int anInt7981;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
	public volatile boolean aBoolean604 = true;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()Lclient!ri;")
	public abstract Class3_Sub9 method6696();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
	protected final void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean604) {
			this.method6702(arg0, arg1, arg2);
		} else {
			this.method6701(arg2);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	public int method6698() {
		return 255;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
	public abstract int method6699();

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lclient!ri;")
	public abstract Class3_Sub9 method6700();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public abstract void method6701(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "([III)V")
	public abstract void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
