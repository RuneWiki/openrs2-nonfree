import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class224 {

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "I")
	private volatile int anInt6152;

	@OriginalMember(owner = "client!lha", name = "r", descriptor = "Lclient!wl;")
	private Class392 aClass392_1;

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "Lclient!em;")
	private final Class105 aClass105_8 = new Class105();

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class224(@OriginalArg(0) String arg0) {
		this.aString76 = arg0;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!vi;)V")
	public void method5154(@OriginalArg(1) Class23_Sub10 arg0) {
		@Pc(2) Class105 local2 = this.aClass105_8;
		synchronized (this.aClass105_8) {
			this.aClass105_8.method2447(arg0);
			this.anInt6152++;
		}
		if (this.aClass392_1 != null) {
			@Pc(38) Class392 local38 = this.aClass392_1;
			synchronized (this.aClass392_1) {
				this.aClass392_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!wl;)V")
	public void method5156(@OriginalArg(1) Class392 arg0) {
		this.aClass392_1 = arg0;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!cn;)V")
	public void method5157(@OriginalArg(1) Class23_Sub2 arg0) {
		arg0.aBoolean744 = false;
		@Pc(9) Class105 local9 = this.aClass105_8;
		synchronized (this.aClass105_8) {
			this.aClass105_8.method2447(arg0);
			this.anInt6152++;
		}
		if (this.aClass392_1 != null) {
			@Pc(34) Class392 local34 = this.aClass392_1;
			synchronized (this.aClass392_1) {
				this.aClass392_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(ILclient!cn;)V")
	public void method5158(@OriginalArg(1) Class23_Sub2 arg0) {
		arg0.aBoolean744 = true;
		@Pc(19) Class105 local19 = this.aClass105_8;
		synchronized (this.aClass105_8) {
			this.aClass105_8.method2447(arg0);
			this.anInt6152++;
		}
		if (this.aClass392_1 != null) {
			@Pc(44) Class392 local44 = this.aClass392_1;
			synchronized (this.aClass392_1) {
				this.aClass392_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(B)Lclient!gv;")
	public Class23 method5159() {
		@Pc(13) Class105 local13 = this.aClass105_8;
		synchronized (this.aClass105_8) {
			@Pc(20) Class23 local20 = this.aClass105_8.method2444();
			local20.method8588();
			this.anInt6152--;
			return local20;
		}
	}

	@OriginalMember(owner = "client!lha", name = "c", descriptor = "(B)Z")
	public boolean method5161() {
		return this.anInt6152 == 0;
	}
}
