import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class275 implements Interface12 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!js;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!is;")
	private final Class165 aClass165_2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!is;Lclient!js;)V")
	public Class275(@OriginalArg(0) Class165 arg0, @OriginalArg(1) Class179 arg1) {
		this.aClass179_1 = arg1;
		this.aClass165_2 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		@Pc(11) Class53 local11 = this.aClass165_2.method3613(this.aClass179_1.anInt4819);
		if (local11 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass179_1.aClass62_9.method1173(Static26.anInt651, this.aClass179_1.anInt4828) + this.aClass179_1.anInt4817;
		@Pc(47) int local47 = this.aClass179_1.aClass279_8.method6456(Static554.anInt9119, this.aClass179_1.anInt4820) + this.aClass179_1.anInt4825;
		if (this.aClass179_1.aBoolean386) {
			Static307.aClass100_6.method6212(local33, local47, this.aClass179_1.anInt4828, this.aClass179_1.anInt4820, this.aClass179_1.anInt4822, 0);
		}
		local47 += this.method6386(local33, Static419.aClass29_13, local47, local11.aString10) * 12;
		local47 += 8;
		if (this.aClass179_1.aBoolean386) {
			Static307.aClass100_6.method6190(local33, local47, this.aClass179_1.anInt4828 + local33 - 1, local47, this.aClass179_1.anInt4822, 0);
		}
		local47++;
		local47 += this.method6386(local33, Static419.aClass29_13, local47, local11.aString12) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method6386(local33, Static419.aClass29_13, local47, local11.aString11) * 12;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		return this.aClass165_2.method3615();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!la;IILjava/lang/String;Z)I")
	private int method6386(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		return arg1.method7104(this.aClass179_1.anInt4827, 0, null, this.aClass179_1.anInt4828 - 10, arg3, this.aClass179_1.anInt4821, 0, 0, this.aClass179_1.anInt4820 - 10, null, null, 0, 0, arg2 + 5, arg0 - -5);
	}
}
