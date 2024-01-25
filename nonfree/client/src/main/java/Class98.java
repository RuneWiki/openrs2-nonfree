import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class98 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!wf;")
	private final Class316 aClass316_18 = new Class316(64);

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!kda;")
	private final Class160 aClass160_32;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class98(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_32 = arg2;
		if (this.aClass160_32 != null) {
			this.aClass160_32.method4207(11);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method3002() {
		@Pc(2) Class316 local2 = this.aClass316_18;
		synchronized (this.aClass316_18) {
			this.aClass316_18.method7794();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method3005() {
		@Pc(10) Class316 local10 = this.aClass316_18;
		synchronized (this.aClass316_18) {
			this.aClass316_18.method7791(5);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lclient!ik;")
	public Class134 method3006(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_18;
		@Pc(16) Class134 local16;
		synchronized (this.aClass316_18) {
			local16 = (Class134) this.aClass316_18.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_32;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_32) {
			local38 = this.aClass160_32.method4198(arg0, 11);
		}
		local16 = new Class134();
		if (local38 != null) {
			local16.method3778(new Class1_Sub13(local38));
		}
		@Pc(68) Class316 local68 = this.aClass316_18;
		synchronized (this.aClass316_18) {
			this.aClass316_18.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public void method3007() {
		@Pc(6) Class316 local6 = this.aClass316_18;
		synchronized (this.aClass316_18) {
			this.aClass316_18.method7803();
		}
	}
}
