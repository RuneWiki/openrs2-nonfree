import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class187 {

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
	private volatile int anInt5051;

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "Lclient!hs;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "Lclient!kf;")
	private final Class178 aClass178_13 = new Class178();

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString35;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class187(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Z")
	public boolean method4389() {
		return this.anInt5051 == 0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!pk;)V")
	public void method4390(@OriginalArg(1) Class41_Sub6 arg0) {
		@Pc(6) Class178 local6 = this.aClass178_13;
		synchronized (this.aClass178_13) {
			this.aClass178_13.method4166(arg0);
			this.anInt5051++;
		}
		if (this.aClass136_1 != null) {
			@Pc(31) Class136 local31 = this.aClass136_1;
			synchronized (this.aClass136_1) {
				this.aClass136_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!rb;B)V")
	public void method4394(@OriginalArg(0) Class41_Sub2 arg0) {
		arg0.aBoolean735 = false;
		@Pc(9) Class178 local9 = this.aClass178_13;
		synchronized (this.aClass178_13) {
			this.aClass178_13.method4166(arg0);
			this.anInt5051++;
		}
		if (this.aClass136_1 != null) {
			@Pc(39) Class136 local39 = this.aClass136_1;
			synchronized (this.aClass136_1) {
				this.aClass136_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(Lclient!rb;B)V")
	public void method4395(@OriginalArg(0) Class41_Sub2 arg0) {
		arg0.aBoolean735 = true;
		@Pc(18) Class178 local18 = this.aClass178_13;
		synchronized (this.aClass178_13) {
			this.aClass178_13.method4166(arg0);
			this.anInt5051++;
		}
		if (this.aClass136_1 != null) {
			@Pc(43) Class136 local43 = this.aClass136_1;
			synchronized (this.aClass136_1) {
				this.aClass136_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Lclient!ki;")
	public Class41 method4396() {
		@Pc(8) Class178 local8 = this.aClass178_13;
		synchronized (this.aClass178_13) {
			@Pc(15) Class41 local15 = this.aClass178_13.method4168();
			local15.method7833();
			this.anInt5051--;
			return local15;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILclient!hs;)V")
	public void method4397(@OriginalArg(1) Class136 arg0) {
		this.aClass136_1 = arg0;
	}
}
