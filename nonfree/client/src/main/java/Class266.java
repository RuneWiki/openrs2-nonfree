import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class266 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!rp;")
	public Class223 aClass223_4;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public int anInt6913;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public int anInt6915;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
	public boolean aBoolean599 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!wm;)V")
	private void method5495(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.anInt6915 = arg1.method2896();
		} else if (arg0 == 2) {
			this.anInt6913 = arg1.method2881();
		} else if (arg0 == 3) {
			this.aBoolean599 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt6915 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method5497(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2915();
			if (local17 == 0) {
				return;
			}
			this.method5495(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZILclient!za;I)Lclient!o;")
	public Class85 method5498(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.anInt6915 | arg1.anInt7048 << 19);
		@Pc(32) Class85 local32 = (Class85) this.aClass223_4.aClass77_44.method1387(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass223_4.aClass185_92.method4000(this.anInt6915)) {
			@Pc(59) Class52 local59 = Static467.method891(this.aClass223_4.aClass185_92, this.anInt6915, 0);
			if (local59 != null) {
				local59.anInt1018 = local59.anInt1020 = local59.anInt1016 = local59.anInt1017 = 0;
				if (arg0) {
					local59.method885();
				}
				for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
					local59.method884();
				}
			}
			local32 = arg1.method5707(local59);
			if (local32 != null) {
				this.aClass223_4.aClass77_44.method1396(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Z")
	public boolean method5500() {
		return this.aClass223_4.aClass185_92.method4000(this.anInt6915);
	}
}
