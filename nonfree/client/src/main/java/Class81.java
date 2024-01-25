import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class81 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!wf;")
	private final Class316 aClass316_14 = new Class316(64);

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	public int anInt2816 = 0;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!kda;")
	private final Class160 aClass160_25;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "I")
	public final int anInt2812;

	static {
		new Class114(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class81(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_25 = arg2;
		this.anInt2812 = this.aClass160_25.method4207(4);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method2635() {
		@Pc(2) Class316 local2 = this.aClass316_14;
		synchronized (this.aClass316_14) {
			this.aClass316_14.method7803();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method2637() {
		@Pc(2) Class316 local2 = this.aClass316_14;
		synchronized (this.aClass316_14) {
			this.aClass316_14.method7794();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
	public void method2638() {
		@Pc(2) Class316 local2 = this.aClass316_14;
		synchronized (this.aClass316_14) {
			this.aClass316_14.method7791(5);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!ls;")
	public Class184 method2640(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_14;
		@Pc(25) Class184 local25;
		synchronized (this.aClass316_14) {
			local25 = (Class184) this.aClass316_14.method7799((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class160 local38 = this.aClass160_25;
		@Pc(47) byte[] local47;
		synchronized (this.aClass160_25) {
			local47 = this.aClass160_25.method4198(arg0, 4);
		}
		local25 = new Class184();
		local25.anInt5607 = arg0;
		local25.aClass81_5 = this;
		if (local47 != null) {
			local25.method4841(new Class1_Sub13(local47));
		}
		local25.method4844();
		local6 = this.aClass316_14;
		synchronized (this.aClass316_14) {
			this.aClass316_14.method7792((long) arg0, local25);
			return local25;
		}
	}
}
