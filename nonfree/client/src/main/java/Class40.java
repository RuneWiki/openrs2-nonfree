import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class40 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public int anInt1134;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public int anInt1135;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "Lclient!bt;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method998(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method1003(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z")
	public boolean method999() {
		return this.aClass33_1.aClass308_19.method6538(this.anInt1134);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!r;BZ)Lclient!f;")
	public Class5 method1002(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt8385 << 19 | (arg2 ? 262144 : 0) | this.anInt1134 | arg0 << 16);
		@Pc(32) Class5 local32 = (Class5) this.aClass33_1.aClass207_4.method4390(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass33_1.aClass308_19.method6538(this.anInt1134)) {
			@Pc(61) Class282 local61 = Static604.method6027(this.aClass33_1.aClass308_19, this.anInt1134, 0);
			if (local61 != null) {
				local61.anInt7489 = local61.anInt7491 = local61.anInt7488 = local61.anInt7492 = 0;
				if (arg2) {
					local61.method6029();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method6017();
				}
			}
			local32 = arg1.method6838(local61, true);
			if (local32 != null) {
				this.aClass33_1.aClass207_4.method4391(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!ac;)V")
	private void method1003(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt1134 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt1135 = arg1.method7919();
		} else if (arg0 == 3) {
			this.aBoolean57 = true;
		} else if (arg0 == 4) {
			this.anInt1134 = -1;
		}
	}
}
