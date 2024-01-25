import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15 {

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!f;")
	private Class106 aClass106_1;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	private volatile int anInt226;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!vs;")
	private final Class385 aClass385_1 = new Class385();

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class15(@OriginalArg(0) String arg0) {
		this.aString8 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
	public boolean method198() {
		return this.anInt226 == 0;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!vk;")
	public Class60 method199() {
		@Pc(8) Class385 local8 = this.aClass385_1;
		synchronized (this.aClass385_1) {
			@Pc(21) Class60 local21 = this.aClass385_1.method8778();
			local21.method8914();
			this.anInt226--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!f;B)V")
	public void method200(@OriginalArg(0) Class106 arg0) {
		this.aClass106_1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!rfa;B)V")
	public void method202(@OriginalArg(0) Class60_Sub1 arg0) {
		arg0.aBoolean684 = true;
		@Pc(17) Class385 local17 = this.aClass385_1;
		synchronized (this.aClass385_1) {
			this.aClass385_1.method8779(arg0);
			this.anInt226++;
		}
		if (this.aClass106_1 != null) {
			@Pc(42) Class106 local42 = this.aClass106_1;
			synchronized (this.aClass106_1) {
				this.aClass106_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!rfa;)V")
	public void method204(@OriginalArg(1) Class60_Sub1 arg0) {
		arg0.aBoolean684 = false;
		@Pc(9) Class385 local9 = this.aClass385_1;
		synchronized (this.aClass385_1) {
			this.aClass385_1.method8779(arg0);
			this.anInt226++;
		}
		if (this.aClass106_1 != null) {
			@Pc(42) Class106 local42 = this.aClass106_1;
			synchronized (this.aClass106_1) {
				this.aClass106_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!jia;)V")
	public void method205(@OriginalArg(1) Class60_Sub5 arg0) {
		@Pc(10) Class385 local10 = this.aClass385_1;
		synchronized (this.aClass385_1) {
			this.aClass385_1.method8779(arg0);
			this.anInt226++;
		}
		if (this.aClass106_1 != null) {
			@Pc(39) Class106 local39 = this.aClass106_1;
			synchronized (this.aClass106_1) {
				this.aClass106_1.notify();
			}
		}
	}
}
