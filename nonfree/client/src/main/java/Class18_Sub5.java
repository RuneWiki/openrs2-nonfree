import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class18_Sub5 extends Class18 {

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Lclient!sea;")
	private Class315 aClass315_2;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!sea;")
	private Class315 aClass315_3;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "Lclient!sea;")
	private Class315 aClass315_4;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!sea;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "Z")
	private final boolean aBoolean219;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!fq;")
	private Class65_Sub1 aClass65_Sub1_2;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class18_Sub5(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
		if (super.aClass95_Sub1_39.aBoolean192) {
			this.aClass315_2 = Static324.method4332("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass95_Sub1_39);
			this.aClass315_3 = Static324.method4332("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass95_Sub1_39);
			this.aClass315_4 = Static324.method4332("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass95_Sub1_39);
			this.aClass315_1 = Static324.method4332("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass95_Sub1_39);
			if (this.aClass315_1 != null & this.aClass315_3 != null & this.aClass315_2 != null & this.aClass315_4 != null) {
				this.aClass65_Sub1_2 = new Class65_Sub1(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass65_Sub1_2.method1424(false, false);
				this.aBoolean219 = true;
			} else {
				this.aBoolean219 = false;
			}
		} else {
			this.aBoolean219 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.aBoolean221) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean221 = false;
		}
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(null);
		super.aClass95_Sub1_39.method2105(8448, 8448);
		super.aClass95_Sub1_39.method2101(768, 5890, 0);
		super.aClass95_Sub1_39.method2101(770, 34166, 2);
		super.aClass95_Sub1_39.method2095(0, 5890);
		super.aClass95_Sub1_39.method2098(0);
		if (this.aBoolean220) {
			super.aClass95_Sub1_39.method2101(768, 5890, 0);
			super.aClass95_Sub1_39.method2095(0, 5890);
			this.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7552(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public void method2446() {
		@Pc(7) Class177_Sub3 local7 = super.aClass95_Sub1_39.aClass177_Sub3_4;
		if (this.aBoolean218) {
			OpenGL.glBindProgramARB(34336, ~super.aClass95_Sub1_39.anInt2542 == Integer.MIN_VALUE ? this.aClass315_3.anInt8563 : this.aClass315_1.anInt8563);
		} else {
			OpenGL.glBindProgramARB(34336, ~super.aClass95_Sub1_39.anInt2542 == Integer.MIN_VALUE ? this.aClass315_2.anInt8563 : this.aClass315_4.anInt8563);
		}
		local7.method7886(0.0F, -1.0F, (float) 0, (float) super.aClass95_Sub1_39.anInt2542, Static639.aFloatArray84);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static639.aFloatArray84[0], Static639.aFloatArray84[1], Static639.aFloatArray84[2], Static639.aFloatArray84[3]);
		OpenGL.glEnable(34336);
		this.aBoolean221 = true;
		this.method2448();
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	public void method2448() {
		if (!this.aBoolean221) {
			return;
		}
		@Pc(16) int local16 = super.aClass95_Sub1_39.XA();
		@Pc(20) int local20 = super.aClass95_Sub1_39.i();
		@Pc(32) float local32 = -((float) (local16 - local20) * 0.125F) + (float) local16;
		@Pc(44) float local44 = -((float) (local16 - local20) * 0.25F) + (float) local16;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, local32, 1.0F / (float) super.aClass95_Sub1_39.anInt2557, (float) super.aClass95_Sub1_39.anInt2544 / 255.0F);
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2109(super.aClass95_Sub1_39.anInt2537);
		super.aClass95_Sub1_39.method2098(0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7544() {
		return this.aBoolean219;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7550(@OriginalArg(1) boolean arg0) {
		this.aBoolean218 = arg0;
		super.aClass95_Sub1_39.method2098(1);
		super.aClass95_Sub1_39.method2077(this.aClass65_Sub1_2);
		super.aClass95_Sub1_39.method2105(34165, 7681);
		super.aClass95_Sub1_39.method2101(768, 34166, 0);
		super.aClass95_Sub1_39.method2101(770, 5890, 2);
		super.aClass95_Sub1_39.method2095(0, 34168);
		super.aClass95_Sub1_39.method2098(0);
		this.method2446();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZLclient!hl;)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		if (arg1 != null) {
			if (this.aBoolean220) {
				super.aClass95_Sub1_39.method2101(768, 5890, 0);
				super.aClass95_Sub1_39.method2095(0, 5890);
				this.aBoolean220 = false;
			}
			super.aClass95_Sub1_39.method2077(arg1);
			super.aClass95_Sub1_39.method2106(arg0);
		} else if (!this.aBoolean220) {
			super.aClass95_Sub1_39.method2077(super.aClass95_Sub1_39.aClass65_Sub1_1);
			super.aClass95_Sub1_39.method2106(1);
			super.aClass95_Sub1_39.method2101(768, 34168, 0);
			super.aClass95_Sub1_39.method2095(0, 34168);
			this.aBoolean220 = true;
		}
	}
}
