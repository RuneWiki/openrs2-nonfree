import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "Lclient!sn;")
	public Class4_Sub16 aClass4_Sub16_5;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!sda;")
	public Class4_Sub13 aClass4_Sub13_5;

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
	public int anInt7510;

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "Z")
	public volatile boolean aBoolean532 = true;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public abstract void method6215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "()Lclient!sda;")
	public abstract Class4_Sub13 method6216();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "()I")
	public abstract int method6217();

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "()I")
	public int method6218() {
		return 255;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "([III)V")
	protected final void method6219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean532) {
			this.method6221(arg0, arg1, arg2);
		} else {
			this.method6215(arg2);
		}
	}

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "()Lclient!sda;")
	public abstract Class4_Sub13 method6220();

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "([III)V")
	public abstract void method6221(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
