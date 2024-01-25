import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
	protected int[] anIntArray236;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	protected int anInt4295;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
	protected int anInt4302;

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
	private int anInt4296 = -1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)I")
	@Override
	public final int method8338() {
		return this.anInt4296;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public final void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4296 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
	@Override
	public final void method8339() {
		super.method8339();
		this.anIntArray236 = null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577 && this.method3684()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt4302 * (Static638.anInt10476 == this.anInt4295 ? arg0 : this.anInt4295 * arg0 / Static638.anInt10476);
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (Static164.anInt8839 == this.anInt4302) {
				for (local69 = 0; local69 < Static164.anInt8839; local69++) {
					local77 = this.anIntArray236[local59++];
					local39[local69] = (local77 & 0xFF) << 4;
					local35[local69] = local77 >> 4 & 0xFF0;
					local31[local69] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static164.anInt8839; local69++) {
					local77 = local69 * this.anInt4302 / Static164.anInt8839;
					@Pc(125) int local125 = this.anIntArray236[local77 + local59];
					local39[local69] = (local125 & 0xFF) << 4;
					local35[local69] = local125 >> 4 & 0xFF0;
					local31[local69] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z")
	protected final boolean method3684() {
		if (this.anIntArray236 != null) {
			return true;
		} else if (this.anInt4296 >= 0) {
			@Pc(33) Class28 local33 = Static274.anInt5832 >= 0 ? Static649.method613(Static506.aClass181_103, Static274.anInt5832, this.anInt4296) : Static649.method605(Static506.aClass181_103, this.anInt4296);
			local33.method612();
			this.anIntArray236 = local33.method611();
			this.anInt4295 = local33.anInt616;
			this.anInt4302 = local33.anInt618;
			return true;
		} else {
			return false;
		}
	}
}
