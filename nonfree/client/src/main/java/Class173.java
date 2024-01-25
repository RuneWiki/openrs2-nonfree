import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class173 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!wf;")
	private final Class316 aClass316_34 = new Class316(64);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!kda;")
	private final Class160 aClass160_61;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public final int anInt5155;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class173(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_61 = arg2;
		if (this.aClass160_61 == null) {
			this.anInt5155 = 0;
		} else {
			this.anInt5155 = this.aClass160_61.method4207(16);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V")
	public void method4404() {
		@Pc(6) Class316 local6 = this.aClass316_34;
		synchronized (this.aClass316_34) {
			this.aClass316_34.method7791(5);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method4405() {
		@Pc(2) Class316 local2 = this.aClass316_34;
		synchronized (this.aClass316_34) {
			this.aClass316_34.method7794();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method4407() {
		@Pc(12) Class316 local12 = this.aClass316_34;
		synchronized (this.aClass316_34) {
			this.aClass316_34.method7803();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!fea;")
	public Class88 method4409(@OriginalArg(1) int arg0) {
		@Pc(11) Class316 local11 = this.aClass316_34;
		@Pc(21) Class88 local21;
		synchronized (this.aClass316_34) {
			local21 = (Class88) this.aClass316_34.method7799((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class160 local34 = this.aClass160_61;
		@Pc(43) byte[] local43;
		synchronized (this.aClass160_61) {
			local43 = this.aClass160_61.method4198(arg0, 16);
		}
		local21 = new Class88();
		if (local43 != null) {
			local21.method2854(new Class1_Sub13(local43));
		}
		@Pc(65) Class316 local65 = this.aClass316_34;
		synchronized (this.aClass316_34) {
			this.aClass316_34.method7792((long) arg0, local21);
			return local21;
		}
	}
}
