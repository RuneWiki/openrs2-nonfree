import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class134 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public int anInt4189;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public int anInt4191;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public int anInt4192;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public int anInt4193;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public int anInt4194;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public int anInt4190 = 8;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
	public int anInt4195 = 16777215;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!jp;IZ)V")
	private void method3820(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4190 = arg0.method8593();
		} else if (arg1 == 2) {
			this.aBoolean314 = true;
		} else if (arg1 == 3) {
			this.anInt4193 = arg0.method8589();
			this.anInt4191 = arg0.method8589();
			this.anInt4189 = arg0.method8589();
		} else if (arg1 == 4) {
			this.anInt4192 = arg0.method8632();
		} else if (arg1 == 5) {
			this.anInt4194 = arg0.method8593();
		} else if (arg1 == 6) {
			this.anInt4195 = arg0.method8607();
			return;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!jp;)V")
	public void method3821(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 == 0) {
				return;
			}
			this.method3820(arg0, local13);
		}
	}
}
