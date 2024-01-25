import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class72 {

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!rp;")
	private final Class220 aClass220_13 = new Class220(64);

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!lt;")
	private final Class158 aClass158_25;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class72(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_25 = arg2;
		this.aClass158_25.method3683(31);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public void method1664() {
		@Pc(2) Class220 local2 = this.aClass220_13;
		synchronized (this.aClass220_13) {
			this.aClass220_13.method4998(5);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public void method1666() {
		@Pc(6) Class220 local6 = this.aClass220_13;
		synchronized (this.aClass220_13) {
			this.aClass220_13.method4987();
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)Lclient!ru;")
	public Class224 method1667(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_13;
		@Pc(16) Class224 local16;
		synchronized (this.aClass220_13) {
			local16 = (Class224) this.aClass220_13.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_25.method3672(arg0, 31);
		local16 = new Class224();
		if (local33 != null) {
			local16.method5050(new Class6_Sub15(local33));
		}
		@Pc(49) Class220 local49 = this.aClass220_13;
		synchronized (this.aClass220_13) {
			this.aClass220_13.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public void method1668() {
		@Pc(2) Class220 local2 = this.aClass220_13;
		synchronized (this.aClass220_13) {
			this.aClass220_13.method4999();
		}
	}
}
