import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class252 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!lm;")
	public Class212 aClass212_3;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "I")
	public int anInt6295;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public int anInt6300;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z")
	public boolean method5254() {
		return this.aClass212_3.aClass229_72.method4954(this.anInt6295);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BILclient!gk;)V")
	private void method5255(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt6295 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt6300 = arg1.method4503();
		} else if (arg0 == 3) {
			this.aBoolean494 = true;
		} else if (arg0 == 4) {
			this.anInt6295 = -1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIILclient!r;)Lclient!f;")
	public Class38 method5256(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(24) long local24 = (long) (this.anInt6295 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.anInt8492 << 19);
		@Pc(32) Class38 local32 = (Class38) this.aClass212_3.aClass21_47.method324(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass212_3.aClass229_72.method4954(this.anInt6295)) {
			@Pc(54) Class344 local54 = Static603.method7117(this.aClass212_3.aClass229_72, this.anInt6295, 0);
			if (local54 != null) {
				local54.anInt8945 = local54.anInt8948 = local54.anInt8949 = local54.anInt8950 = 0;
				if (arg0) {
					local54.method7127();
				}
				for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
					local54.method7115();
				}
			}
			local32 = arg2.method6845(local54, true);
			if (local32 != null) {
				this.aClass212_3.aClass21_47.method317(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!gk;)V")
	public void method5257(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4464();
			if (local9 == 0) {
				return;
			}
			this.method5255(local9, arg0);
		}
	}
}
