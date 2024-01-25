import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class72 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class72(@OriginalArg(0) Class15 arg0) {
		@Pc(6) byte[] local6 = arg0.method536(6);
		this.method1730(new Class3_Sub25(local6));
		if (this.anIntArray150 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	private Class72() {
		this.anIntArray150 = new int[0];
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!jp;)V")
	private void method1730(@OriginalArg(1) Class3_Sub25 arg0) {
		label19: while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 != 0) {
				if (local13 != 1) {
					continue;
				}
				@Pc(27) int local27 = arg0.method8632();
				this.anIntArray150 = new int[local27];
				@Pc(33) int local33 = 0;
				while (true) {
					if (local33 >= this.anIntArray150.length) {
						continue label19;
					}
					this.anIntArray150[local33] = arg0.method8632();
					local33++;
				}
			}
			return;
		}
	}
}
