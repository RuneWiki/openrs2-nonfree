import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class281 {

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
	public int anInt8085;

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "Lclient!kb;")
	public Class186 aClass186_4;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
	public int anInt8088;

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "Z")
	public boolean aBoolean557 = false;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!gga;)V")
	private void method6916(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt8088 = arg1.method8363();
		} else if (arg0 == 2) {
			this.anInt8085 = arg1.method8344();
		} else if (arg0 == 3) {
			this.aBoolean557 = true;
		} else if (arg0 == 4) {
			this.anInt8088 = -1;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!gga;I)V")
	public void method6919(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8374();
			if (local14 == 0) {
				return;
			}
			this.method6916(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBZLclient!ha;)Lclient!ho;")
	public Class9 method6920(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class132 arg2) {
		@Pc(24) long local24 = (long) (this.anInt8088 | arg0 << 16 | (arg1 ? 262144 : 0) | arg2.anInt8773 << 19);
		@Pc(32) Class9 local32 = (Class9) this.aClass186_4.aClass10_26.method373(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass186_4.aClass8_77.method273(this.anInt8088)) {
			@Pc(59) Class112 local59 = Static681.method2327(this.aClass186_4.aClass8_77, this.anInt8088, 0);
			if (local59 != null) {
				local59.anInt2744 = local59.anInt2745 = local59.anInt2742 = local59.anInt2741 = 0;
				if (arg1) {
					local59.method2321();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method2316();
				}
			}
			local32 = arg2.method7488(local59, true);
			if (local32 != null) {
				this.aClass186_4.aClass10_26.method366(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)Z")
	public boolean method6921() {
		return this.aClass186_4.aClass8_77.method273(this.anInt8088);
	}
}
