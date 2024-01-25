import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class3_Sub10_Sub7 extends Class3_Sub10 {

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "Lclient!sd;")
	private Class267 aClass267_16;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!rt;I)V")
	private void method3291(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(8) int local8 = arg1.method7548();
		@Pc(15) int local15;
		if (this.aClass267_16 == null) {
			local15 = Static483.method7134(local8);
			this.aClass267_16 = new Class267(local15);
		}
		for (local15 = 0; local15 < local8; local15++) {
			@Pc(36) boolean local36 = arg1.method7548() == 1;
			@Pc(40) int local40 = arg1.method7551();
			@Pc(49) Class3 local49;
			if (local36) {
				local49 = new Class3_Sub35(arg1.method7589());
			} else {
				local49 = new Class3_Sub47(arg1.method7549());
			}
			this.aClass267_16.method6640(local49, (long) local40);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method3292(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass267_16 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub35 local21 = (Class3_Sub35) this.aClass267_16.method6644((long) arg0);
			return local21 == null ? arg1 : local21.aString45;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLclient!rt;)V")
	public void method3297(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method3291(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZII)I")
	public int method3298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass267_16 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub47 local16 = (Class3_Sub47) this.aClass267_16.method6644((long) arg0);
			return local16 == null ? arg1 : local16.anInt8701;
		}
	}
}
