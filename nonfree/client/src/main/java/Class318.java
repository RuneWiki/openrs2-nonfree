import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class318 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!gf;")
	public Class132 aClass132_3;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public int anInt8100;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
	public int anInt8102;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
	public boolean aBoolean634 = false;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!es;B)V")
	public void method7048(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method7050(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!es;I)V")
	private void method7050(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8100 = arg0.method8859();
		} else if (arg1 == 2) {
			this.anInt8102 = arg0.method8827();
		} else if (arg1 == 3) {
			this.aBoolean634 = true;
		} else if (arg1 == 4) {
			this.anInt8100 = -1;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!tf;")
	public Class17 method7053(@OriginalArg(0) Class33 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(24) long local24 = (long) (this.anInt8100 | arg2 << 16 | (arg1 ? 262144 : 0) | arg0.anInt9458 << 19);
		@Pc(34) Class17 local34 = (Class17) this.aClass132_3.aClass352_27.method7653(local24);
		if (local34 != null) {
			return local34;
		} else if (this.aClass132_3.aClass34_47.method1235(this.anInt8100)) {
			@Pc(56) Class51 local56 = Static682.method1662(this.aClass132_3.aClass34_47, this.anInt8100, 0);
			if (local56 != null) {
				local56.anInt1658 = local56.anInt1659 = local56.anInt1660 = local56.anInt1662 = 0;
				if (arg1) {
					local56.method1665();
				}
				for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
					local56.method1661();
				}
			}
			local34 = arg0.method8147(local56, true);
			if (local34 != null) {
				this.aClass132_3.aClass352_27.method7655(local24, local34);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Z")
	public boolean method7054() {
		return this.aClass132_3.aClass34_47.method1235(this.anInt8100);
	}
}
