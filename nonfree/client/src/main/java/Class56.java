import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class56 {

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "Lclient!jda;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
	private int anInt1500;

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
	public int anInt1502;

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!dt;BI)V")
	private void method1313(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1500 = arg0.method7951();
		} else if (arg1 == 2) {
			this.anInt1502 = arg0.method7954();
			this.anInt1505 = arg0.method7954();
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)Lclient!vf;")
	public synchronized Class370 method1314() {
		@Pc(13) Class370 local13 = (Class370) this.aClass175_1.aClass295_19.method6470((long) this.anInt1500);
		if (local13 != null) {
			return local13;
		}
		local13 = Static688.method8590(this.aClass175_1.aClass362_55, this.anInt1500, 0);
		if (local13 != null) {
			this.aClass175_1.aClass295_19.method6469((long) this.anInt1500, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZLclient!dt;)V")
	public void method1317(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7954();
			if (local13 == 0) {
				return;
			}
			this.method1313(arg0, local13);
		}
	}
}
