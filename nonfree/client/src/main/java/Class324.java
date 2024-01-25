import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class324 {

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
	private volatile int anInt8740;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "Lclient!aq;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "Lclient!re;")
	private final Class320 aClass320_7 = new Class320();

	@OriginalMember(owner = "client!rja", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class324(@OriginalArg(0) String arg0) {
		this.aString97 = arg0;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Z)Lclient!vj;")
	public Class4 method7731() {
		@Pc(14) Class320 local14 = this.aClass320_7;
		synchronized (this.aClass320_7) {
			@Pc(21) Class4 local21 = this.aClass320_7.method7605();
			local21.method9416();
			this.anInt8740--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!aq;I)V")
	public void method7732(@OriginalArg(0) Class23 arg0) {
		this.aClass23_1 = arg0;
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)Z")
	public boolean method7735() {
		return this.anInt8740 == 0;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method7736(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.aBoolean885 = true;
		@Pc(9) Class320 local9 = this.aClass320_7;
		synchronized (this.aClass320_7) {
			this.aClass320_7.method7600(arg0);
			this.anInt8740++;
		}
		if (this.aClass23_1 != null) {
			@Pc(41) Class23 local41 = this.aClass23_1;
			synchronized (this.aClass23_1) {
				this.aClass23_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!br;B)V")
	public void method7737(@OriginalArg(0) Class4_Sub4 arg0) {
		@Pc(2) Class320 local2 = this.aClass320_7;
		synchronized (this.aClass320_7) {
			this.aClass320_7.method7600(arg0);
			this.anInt8740++;
		}
		if (this.aClass23_1 != null) {
			@Pc(38) Class23 local38 = this.aClass23_1;
			synchronized (this.aClass23_1) {
				this.aClass23_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method7738(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.aBoolean885 = false;
		@Pc(17) Class320 local17 = this.aClass320_7;
		synchronized (this.aClass320_7) {
			this.aClass320_7.method7600(arg0);
			this.anInt8740++;
		}
		if (this.aClass23_1 != null) {
			@Pc(42) Class23 local42 = this.aClass23_1;
			synchronized (this.aClass23_1) {
				this.aClass23_1.notify();
			}
		}
	}
}
