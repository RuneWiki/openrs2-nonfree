import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class146 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!rp;")
	private final Class220 aClass220_29 = new Class220(64);

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
	public int anInt3747 = 0;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!lt;")
	private final Class158 aClass158_48;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	public final int anInt3743;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class146(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_48 = arg2;
		this.anInt3743 = this.aClass158_48.method3683(4);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public void method3336() {
		@Pc(12) Class220 local12 = this.aClass220_29;
		synchronized (this.aClass220_29) {
			this.aClass220_29.method4987();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)Lclient!pb;")
	public Class196 method3337(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_29;
		@Pc(16) Class196 local16;
		synchronized (this.aClass220_29) {
			local16 = (Class196) this.aClass220_29.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_48.method3672(arg0, 4);
		local16 = new Class196();
		local16.aClass146_4 = this;
		local16.anInt4970 = arg0;
		if (local33 != null) {
			local16.method4396(new Class6_Sub15(local33));
		}
		local16.method4397();
		@Pc(58) Class220 local58 = this.aClass220_29;
		synchronized (this.aClass220_29) {
			this.aClass220_29.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public void method3339() {
		@Pc(6) Class220 local6 = this.aClass220_29;
		synchronized (this.aClass220_29) {
			this.aClass220_29.method4999();
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V")
	public void method3341() {
		@Pc(6) Class220 local6 = this.aClass220_29;
		synchronized (this.aClass220_29) {
			this.aClass220_29.method4998(5);
		}
	}
}
