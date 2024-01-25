import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class196 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class196(@OriginalArg(0) Class208 arg0) {
		@Pc(6) byte[] local6 = arg0.method4997(6);
		this.method4406(new Class5_Sub23(local6));
		if (this.anIntArray290 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V")
	private Class196() {
		this.anIntArray290 = new int[0];
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BLclient!ib;)V")
	private void method4406(@OriginalArg(1) Class5_Sub23 arg0) {
		label19: while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 != 0) {
				if (local5 != 1) {
					continue;
				}
				@Pc(14) int local14 = arg0.method8529();
				this.anIntArray290 = new int[local14];
				@Pc(20) int local20 = 0;
				while (true) {
					if (local20 >= this.anIntArray290.length) {
						continue label19;
					}
					this.anIntArray290[local20] = arg0.method8529();
					local20++;
				}
			}
			return;
		}
	}
}
