import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
	public int anInt7037;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "Lclient!cw;")
	public Class2_Sub14 aClass2_Sub14_6;

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "Lclient!lea;")
	public Class2_Sub11 aClass2_Sub11_9;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "Z")
	public volatile boolean aBoolean501 = true;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([III)V")
	public abstract void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()Lclient!lea;")
	public abstract Class2_Sub11 method6156();

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "()Lclient!lea;")
	public abstract Class2_Sub11 method6157();

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "([III)V")
	protected final void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean501) {
			this.method6155(arg0, arg1, arg2);
		} else {
			this.method6159(arg2);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	public abstract void method6159(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "()I")
	public int method6160() {
		return 255;
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "()I")
	public abstract int method6161();
}
